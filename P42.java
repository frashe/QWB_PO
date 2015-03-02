import java.util.Scanner;
import java.lang.Math;
class P42
{
				public static void main(String[] args)
				{
					int i,f,f2,q,q2,z,z2 ;
					float e ; 
					double y, s=0,x;
					Scanner EEE = new Scanner(System.in);
											System.out.print("Vvedite tochnost' (e) = ");
											e = EEE.nextFloat();																							

											System.out.print("Vvedite peremennyy  ( v diapazone ot -1 do 1 ) x = ");
											x = EEE.nextFloat();
											if ( Math.abs(x)<1)
											{
													 	 
															i=2;
															z=1;
															z2=2;
															
															y=Math.pow(x,i)/1.5;
															
			
															while (Math.abs(y) >= e) 
															   {			   														 
																   s+=y;i+=2;z++;z2+=2;
																   System.out.println("Elament = "+y);
																   for (f=1,q=1;q<=z;q++){f=f*q;};															
																   for (f2=1,q2=1;q2<=z2;q2++){f2=f2*q2;};																  
																    if (i%2==0) {y=(-1)*(Math.pow(x,i)/(1.0/f+1.0/f2));} else {y=Math.pow(x,i)/(1.0/f+1.0/f2);}										   
															   }
															   System.out.println("\nSumma = "+s);
															   

													
											} else
								{
										System.out.print("Vi vveli ne vernoe znachenie, vvedite chislo v pravilnom diapazone!");
								}
			
				}
}