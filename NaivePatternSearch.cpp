#include<iostream>
#include<string>
using namespace std;
int check(string s,string m){
		int ls=s.length(),lm=m.length();
		int count=0,i=0;
		if(ls==lm){
			for(i=0;i<ls;i++){
				if(s[i]==m[i])
					++count;
				else{
				  	if(count==0)
				  		return 1;
				  	return count;
				  	}
				}
		    }
		  return count;  
          }
bool search(string pat,string txt){
		int i=0,k=0;
		int N=txt.length(),M=pat.length();
		for(i=0;i<=N-M;i+=k){
			k=check(txt.substr(i,M),pat);
			if(k==M)
				return true;
			}
			return false;
		}      
          
int main(){
   string pat,txt;
   cin>>pat;
   cin>>txt;
   if(search(pat,txt))
   		cout<<"Yes";
   	else 
   		cout<<"No";
   	return 0;
   	}    
