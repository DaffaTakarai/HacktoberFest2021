//Evaluation of Postfix expression using stack
using namespace std;
#include<iostream>
#include<stack>
int evaluatePostfix(string str){
    stack<int> S;
    for(int i=0;i<str.length();i++){
        if(isdigit(str[i])){
            S.push(str[i]-'0');
        }
        else{
            int op2 = S.top();
            S.pop();
            int op1 = S.top();
            S.pop();
            switch( str[i] ){
                case '+' : S.push(op1+op2); break;
                case '-' : S.push(op1-op2); break;
                case '*' : S.push(op1*op2); break;
                case '/' : S.push(op1/op2); break;
                case '^' : S.push(op1^op2); break;
            }
        }
    }
    return S.top();
}
int main()
{
    string str;
    cout<<"Enter the expression to be evaluated :";
    cin>>str;
    cout<<"Result after evaluation : "<<evaluatePostfix(str);
    return 0;
}
