package cbsc.cha2;

import java.util.Random;

public class BinaryOperation_0 {
	public static void main(String[] args)
	{
		printHeader();
		generateEquations();
		printExercise();
		printCaluculations();
	}

	//1.进入系统------------------------------------------------------------------------------------
		private static void printHeader() {
			System.out.println("欢迎进入加减法口算练习系统-v0.1");
	}
	//2.产生算式------------------------------------------------------------------------------------
		private static int[] generateEquations() {
			int[] equa_vari= new int[3]; 
			char o='+';
			Random random = new Random();
			equa_vari[1]=(short) random.nextInt(2);//加减符号只能是0或1的随机取值
			equa_vari[0]=(short) random.nextInt(101);//m是0-101的随机数
			equa_vari[2]=(short) random.nextInt(101);//n是0-101的随机数
			if(equa_vari[1] == 1)
			{
				o='+';//加减符号==1时，为加法
			}else {
				o='-';//加减符号==0时，为减法
			}
			return equa_vari;
		}
	//3.题目生成------------------------------------------------------------------------------------
		private static int[] printExercise() {		
			char o='+';
			int[] equa_sum=new int[50];
			for(int i=0;i<50;i++) {
				int sr[]=generateEquations();
				int sum;
				if(sr[1] == 1)
				{
					o='+';//加减符号==1时，为加法
					sum = sr[0] + sr[2];
				}else {
					o='-';//加减符号==0时，为减法
					sum = sr[0] + sr[2];
				}
				equa_sum[i]=sum;
				System.out.println(""+(i+1)+":\t"+sr[0]+o+sr[2]+"="+sum);
			}
			return equa_sum;
		}
	//4.计算功能
		private static void printCaluculations() {
			int[] result=printExercise();
			for(int i=0;i<50;i++)
			{
				System.out.println(result[i]);
			}
		}
}
