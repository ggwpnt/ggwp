public class  ForceConvert{
	public static void main(String[] args) {
//ǿ������ת�����Զ�����ת��������̣�ʹ��ʱҪ����ǿ��ת��������
//����
		int n1 = (int)1.9;
		System.out.println("n1="+ n1);

		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1" + b1);

//ǿ������ת��ϸ��
//1.�������������ʹӴ�Сʱʹ��
//2.ǿת����ֻ�������Ĳ�������Ч��������ʹ��С�����������ȼ�
//����
//int x = (int)10*3+6*1.5;�������
		int x = (int)(10*3+6*1.5);//��ȷ
		System.out.println(x);
//3.char���Ϳ��Ա���int�ĳ���ֵ�������ܱ���int�ı���ֵ����Ҫǿת
		char c1 = 100;
		int m = 100;
//char c2 = m;//����
		char c3 = (char)m;//ok
		System.out.println(c3);//���100��Ӧ���ַ�
//4.byte��short��char����������ʱ������int����
	}
}