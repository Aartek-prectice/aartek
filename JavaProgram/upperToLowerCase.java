 class upperToLowerCase
{
public static void main(String gg[])
{
if(gg.length>1)
System.out.println("Enter only one String");
else
{
System.out.println(upperToLowerCase.upperToLower(gg[0]));
}
}
public static String upperToLower(String upper)
{
int y,z=0,x=upper.length();
char c,cc[]=new char[x];
while(z<x)
{
c=upper.charAt(z);
if(c>=65 && c<=97)
{
y=(int)c+32;
c=(char)y;
}
cc[z]=c;
z++;
}
String lower=new String(cc);
return lower;
}
}