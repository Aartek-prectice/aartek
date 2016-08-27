
import java.util.*;
import java.text.SimpleDateFormat;
 class differenceBetweenDates
{
public static int dateFormat(String d1,String d2)
{
long diff=0;
try
{
SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
Date t1=simpleDateFormat.parse(d1);
Date t2=simpleDateFormat.parse(d2);
diff=t2.getTime()-t1.getTime();
diff=diff/(24*60*60*1000);
}catch(Exception e)
{
System.out.println(e);
}
return (int)diff;
}
public static void main(String gg[])
{
String d1,d2;
d1="1/2/2014";
d2="1/3/2014";
int day=differenceBetweenDates.dateFormat(d1,d2);
System.out.println(day);
}
}