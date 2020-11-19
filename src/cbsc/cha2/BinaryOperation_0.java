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

	//1.����ϵͳ------------------------------------------------------------------------------------
		private static void printHeader() {
			System.out.println("��ӭ����Ӽ���������ϰϵͳ-v0.1");
	}
	//2.������ʽ------------------------------------------------------------------------------------
		private static int[] generateEquations() {
			int[] equa_vari= new int[3]; 
			char o='+';
			Random random = new Random();
			equa_vari[1]=(short) random.nextInt(2);//�Ӽ�����ֻ����0��1�����ȡֵ
			equa_vari[0]=(short) random.nextInt(101);//m��0-101�������
			equa_vari[2]=(short) random.nextInt(101);//n��0-101�������
			if(equa_vari[1] == 1)
			{
				o='+';//�Ӽ�����==1ʱ��Ϊ�ӷ�
			}else {
				o='-';//�Ӽ�����==0ʱ��Ϊ����
			}
			return equa_vari;
		}
	//3.��Ŀ����------------------------------------------------------------------------------------
		private static int[] printExercise() {		
			char o='+';
			int[] equa_sum=new int[50];
			for(int i=0;i<50;i++) {
				int sr[]=generateEquations();
				int sum;
				if(sr[1] == 1)
				{
					o='+';//�Ӽ�����==1ʱ��Ϊ�ӷ�
					sum = sr[0] + sr[2];
				}else {
					o='-';//�Ӽ�����==0ʱ��Ϊ����
					sum = sr[0] + sr[2];
				}
				equa_sum[i]=sum;
				System.out.println(""+(i+1)+":\t"+sr[0]+o+sr[2]+"="+sum);
			}
			return equa_sum;
		}
	//4.���㹦��
		private static void printCaluculations() {
			int[] result=printExercise();
			for(int i=0;i<50;i++)
			{
				System.out.println(result[i]);
			}
		}
}
