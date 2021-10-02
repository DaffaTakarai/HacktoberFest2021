#include<iostream>
using namespace std;
int repeatedCharacters(string s){
		int arra[26],arrA[26];
		int i=0,c=101;
		for(i=0;i<26;i++){
		arra[i]=arrA[i]=-1;
			}
		for(i=0;i<s.length();i++){
				if(s[i]>=97){
					if(arra[s[i]-97]==-1)
						arra[s[i]-97]=i;
					else
						c=min(arra[s[i]-97],c);
					}
				else{
					if(arrA[s[i]-65]==-1)
						arrA[s[i]-65]=i;
					else
						c=min(arrA[s[i]-65],c);
					}
				}
		if(c==101)
		 	return -1; 	
		else
			return c;
		}
int main(){
	int T;
	cin>>T;
	while(T--){
		string str;
		cin>>str;
		cout<<repeatedCharacters(str);
		}
	return 0;
}
