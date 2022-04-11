public class  ForceConvert{
	public static void main(String[] args) {
//强制类型转换：自动类型转换的逆过程，使用时要加上强制转换符（）
//例如
		int n1 = (int)1.9;
		System.out.println("n1="+ n1);

		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1" + b1);

//强制类型转换细节
//1.当进行数据类型从大到小时使用
//2.强转符号只针对最近的操作数有效，往往会使用小括号提升优先级
//例如
//int x = (int)10*3+6*1.5;编译错误
		int x = (int)(10*3+6*1.5);//正确
		System.out.println(x);
//3.char类型可以保存int的常量值，但不能保存int的变量值，需要强转
		char c1 = 100;
		int m = 100;
//char c2 = m;//错误
		char c3 = (char)m;//ok
		System.out.println(c3);//输出100对应的字符
//4.byte和short，char类型在运算时，当做int类型
	}
}