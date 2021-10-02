#include<iostream>
using namespace std;
int rotate(int arr[],int n){
    int element=arr[n-1];
    int i;
    for(i=n-1;i>=0;i--){
        arr[i]=arr[i-1];
    }
    arr[0]=element;
    for(i=0;i<n;i++){
        cout<<" "<<arr[i];
    }
}
int main(){
    int arr[]={1,2,3,4,5};
    int n=5;
    rotate(arr,n);
}