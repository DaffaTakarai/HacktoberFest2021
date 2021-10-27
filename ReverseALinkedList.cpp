// reverse a linked list using stack

#include<iostream>
#include<stack>
using namespace std;
struct Node{
    int data;
    Node *next;
};
Node *head =NULL;

void insertval(){
    Node *temp= new Node();
    int num;
    cout<<"enter the value to be inserted:";
    cin>>num;
    temp->data= num;
    temp->next=head;
    head=temp;
}
void display( struct Node *temp){
    cout<<temp->data<<" ";
    if(temp->next!=NULL){
        display(temp->next);
    }
}
void reverseList( struct Node *temp)
{
    stack<struct Node*> S;
    if(head==NULL){ return;}
    while(temp!=NULL){
        S.push(temp);
        temp=temp->next;
    }
    temp=S.top();
    head=temp;
    S.pop();
    while(!S.empty()){
        temp->next = S.top();
        S.pop();
        temp=temp->next;
    }
    temp->next=NULL;
    cout<<"Reversed list :";
    display(head);
}

int main()
{
    int ch;
    do{
        cout<<"\n Enter your choice :";
        cout<<"\n 1. Insert a new element ";
        cout<<"\n 2. Display ";
        cout<<"\n 3. Reverse the list";
        cout<<"\n 4. Exit ";
        cin>>ch;
        if(ch==1){
            insertval();
        }
        else if(ch==2){
            display(head);
        }
        else if(ch==3){
            reverseList(head);
        }
    }while(ch!=4);
    return 0;
}
