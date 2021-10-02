#include<iostream>
using namespace std;
int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int currsum=0,max_sum=INT_MIN;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(currsum>max_sum){
                max_sum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
    return max_sum;
    }
int main(){
    int arr[]={1,2,3,-2,5};
    int n=5;
    cout<<maxSubarraySum(arr,n);
}