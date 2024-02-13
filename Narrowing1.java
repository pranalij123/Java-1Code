class Narrowing1{
public static void main(String []args)
{
//narrowing is used to convert lager type of data to smaller type
float temp=70.6f;
byte temp1=(byte)temp;
System.out.println(temp1);

}
}

//output:70
//while using narrowing there may be data loss
