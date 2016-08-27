 class isPallindrom
{
public static void main(String gg[])
{
if(gg.length>1)
{
System.out.println("Enter Only one String");
}
else
{
int x=isPallidrom(gg[0]);
if(x==1)
{
System.out.println("Is Pallidrom");
}
else
{
System.out.println("Not Pallidrom");
}
}
}
public static int isPallidrom(String str)
{
int f=1,y=0,x=str.length()-1;
while(y<x)
{
if(str.charAt(y)!=str.charAt(x))
{
f=0;
break;
}
y++;
x--;
}
return f;
} 
}