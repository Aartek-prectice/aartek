class wordCount
{
public static int count(String e)
{
int c=0;
String w[]=e.split(" ");
System.out.println(w.length);
for(int i=0;i<w.length;i++)
{
System.out.println(w[i]);
c++;
}
return c;
}
public static void main(String gg[])
{
String g="I live in ujjain";
int a=wordCount.count(g);
System.out.println(a);
}
}