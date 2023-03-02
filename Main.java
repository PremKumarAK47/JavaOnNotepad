class Main
{
public static void main(String[] args)
{
int[] arr= {1,1,2,3,3,4,5};
String num="";
int n=arr.length;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]!=arr[j])
{
num+=arr[i]+" ";
}
}

}
System.out.println(num);
}
}