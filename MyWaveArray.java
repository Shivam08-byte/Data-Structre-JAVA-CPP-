/ { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends


// Function to convert given array to wave like array
// arr: input array
// n: size of array
void convertToWave(int *arr, int n){
    
    int i=0;
        int j=0;
        while(i<(n-1)){
            j=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=j;
            j=0;
            i++;
            i++;
        }
    // Your code here
    
}

// { Driver Code Starts.

int main()
{
    int t,n;
    cin>>t; //Input testcases
    while(t--) //While testcases exist
    {
        cin>>n; //input size of array
        int a[n]; //declare array of size n
        for(int i=0;i<n;i++)
            cin>>a[i]; //input elements of array
        
        convertToWave(a, n);

        for(int i=0;i<n;i++)
            cout<<a[i]<<" "; //print array
            
        cout<<endl;
    }
}  // } Driver Code Ends
