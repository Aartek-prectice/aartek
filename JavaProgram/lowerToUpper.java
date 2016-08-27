class lowerToUpper
{
public static void main(String gg[])
{
if(gg.length>1)
{
System.out.println("please enter only one String");
}
else
{
String upper=lowerToUpper.lowerToUpper(gg[0]);
System.out.println(upper);
}
}
public static String lowerToUpper(String lower)
{
char c,cc[];
cc=new char[lower.length()];
int y,x=0;
while(x<lower.length())
{
c=lower.charAt(x);
if(c>=97 && c<=122)
{
y=(int)c-32;
c=(char)y;
}
cc[x]=c;
x++;
}
String upper=new String(cc);
return upper;
}
}