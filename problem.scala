
object problem extends App{
 
  //problem 1
  def celcius_to_faren(x:Double)=x*1.8 + 32;
  println("Thirty five degree of celcius equal to "+celcius_to_faren(35) +" F");

  //problem 2
  def volume_of_sphere(r:Double)=(3.14159265*r*r*r*4)/3;
  println("Volume of the Radius Five sphere - "+volume_of_sphere(5));

  //problem 3
  def Total_wholesale(n:Int)=if (n>50) (24.95*n*0.6 + 3 + (n-50)*.75)  else (24.95*n*0.6 + 3);
  println("Whole sale of 60 books = Rs."+Total_wholesale(60)+"/-" );
}

