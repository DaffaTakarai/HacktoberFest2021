//Evaluation of Prefix expression using stack
using namespace std;
#include<iostream>
#include<stack>
int evaluatePrefix(string str){
    stack<int> S;
    for(int i=str.length()-1;i>=0;i--){
        if(isdigit(str[i])){
            S.push(str[i]-'0');
        }
        else{
            int op1 = S.top();
            S.pop();
            int op2 = S.top();
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
    cout<<"Result after evaluation : "<<evaluatePrefix(str);
    return 0;
}

