using namespace std;
#include<iostream>
#include<stack>

bool checkParentheses(string str){
    stack<char> s;
    for(int i=0; i<str.length();i++){
        if(str[i]=='(' || str[i]=='{' || str[i]== '['){
                s.push(str[i]);
        }
        else if(str[i]==')' || str[i]=='}' || str[i]== ']'){
            if(s.empty())
                return false;
            else if(str[i]==')' && s.top()!= '(')
                return false;
            else if(str[i]=='}' && s.top()!= '{')
                return false;
            else if(str[i]==']' && s.top()!= '[')
                return false;
            else
                s.pop();
        }
    }
    if(s.empty())
        return true;
    return false;
}
int main()
{
    string str;
    cin>>str;
    if(checkParentheses(str)){
        cout<<" Yes the parentheses are balanced";
    }else{
        cout<<" No, the parentheses are not balanced";
    }
    return 0;
}
