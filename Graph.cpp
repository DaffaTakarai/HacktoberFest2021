#include<iostream>

using namespace std;

struct Edge
{
    int start{0},end{0};
};

main()
{
    int ver{0},edges{0},**ptr;
    cout<<"\nEnter number of vertices ";
    cin>>ver;
    cout<<"\nEnter number of edges ";
    cin>>edges;
    Edge * arr = new Edge[edges];
    ptr = new int * [ver];
    for(int i=0;i<ver;i++)
        ptr[i]= new int [ver]{0};
    cout<<"\nEnter the value ";
    for(int i=0;i<edges;i++)
    {
        int st,en;
        cin>>st>>en;
        if(st>=ver||en>=ver)
        {
            cout<<"\nInvalid input ";
            i--;
        }
        else
        {
            arr[i].start=st;
            arr[i].end=en;
            ptr[st][en] = ptr[en][st] = 1;
        }
    }
    cout<<endl<<endl;
    for(int i=0;i<ver;i++)
    {
        for(int j=0;j<ver;j++)
            cout<<ptr[i][j]<<"\t";
        cout<<endl;
    }

}

