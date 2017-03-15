package secondhomework;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * ʵ��ArrayUtil
 */
@SuppressWarnings("all")
public class MyArrayUtil {
	/**
	 * ����һ����������a , �Ը������ֵ�����û�
		���磺 a = [7, 9 , 30, 3]  ,   �û���Ϊ [3, 30, 9,7]
		���     a = [7, 9, 30, 3, 4] , �û���Ϊ [4,3, 30 , 9,7]
	 * @param origin
	 * @return
	 */
	
	public  void reverseArray(int[] origin){
		int size =origin.length;
		
		for(int i=0;i<size/2;i++){
			int temp=origin[i];
			origin[i]=origin[size-1-i];
			origin[size-1-i]=temp;
		}
		System.out.println(Arrays.toString(origin));
	}
	
	/**
	 * ���������µ�һ�����飺   int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}   
	 * Ҫ������������ֵΪ0����ȥ��������Ϊ0��ֵ����һ���µ����飬���ɵ�������Ϊ��   
	 * {1,3,4,5,6,6,5,4,7,6,7,5}  
	 * @param oldArray
	 * @return
	 */
	
	public void removeZero(int[] oldArray){
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<oldArray.length;i++){
			if(oldArray[i]!=0){
				sb.append(oldArray[i]);
				if(i<oldArray.length-1-1){
					sb.append(",");
				}
			}
		}
		sb.append("]");
		System.out.println(sb);
	}
	
	/**
	 * ���������Ѿ�����õ��������飬 a1��a2 ,  ����һ���µ�����a3, ʹ��a3 ����a1��a2 ������Ԫ�أ� ������Ȼ�������
	 * ���� a1 = [3, 5, 7,8]   a2 = [4, 5, 6,7]    �� a3 Ϊ[3,4,5,6,7,8]    , ע�⣺ �Ѿ��������ظ�
	 * @param array1
	 * @param array2
	 * @return
	 */
	
	public void merge(int[] array1, int[] array2){
		ArrayList al = new ArrayList();
		for(int i=0;i<array1.length;i++){
			al.add(array1[i]);
		}
		
		for(int i=0;i<array2.length;i++){
			if(!al.contains(array2[i])){
				al.add(array2[i]);
			}
		}
		System.out.println(al);
		
		
	}
	
	/**
	 * ��һ���Ѿ��������ݵ����� oldArray������������չ�� ��չ��������ݴ�СΪoldArray.length + size
	 * ע�⣬�������Ԫ��������������Ҫ����
	 * ���� oldArray = [2,3,6] , size = 3,�򷵻ص�������Ϊ
	 * [2,3,6,0,0,0]
	 * @param oldArray
	 * @param size
	 * @return
	 */
	public int[] grow(int [] oldArray,  int size){
		int newLength = oldArray.length;
		int[] newArray=Arrays.copyOf(oldArray, newLength+size);
		
		return newArray;
	}
	
	/**
	 * 쳲���������Ϊ��1��1��2��3��5��8��13��21......  ������һ�����ֵ�� ����С�ڸ�ֵ������
	 * ���磬 max = 15 , �򷵻ص�����Ӧ��Ϊ [1��1��2��3��5��8��13]
	 * max = 1, �򷵻ؿ����� []
	 * @param max
	 * @return
	 */
	public int ifobonacci(int num){
		if(num==1||num==2){
			return 1;
		}else{
			return ifobonacci(num-2)+ifobonacci(num-1);
		}
	}
	
	public void fibonacci(int max){
		ArrayList  al= new ArrayList();
		for(int i=1;i<max;i++){
			if(ifobonacci(i)<max){
				al.add(ifobonacci(i));
			}
		}
		System.out.println(Arrays.toString(al.toArray()));
		
	}
	/**
	 * ����С�ڸ������ֵmax��������������
	 * ����max = 23, ���ص�����Ϊ[2,3,5,7,11,13,17,19]
	 * @param max
	 * @return
	 */
	
	public boolean isPrimes(int num){
		boolean flag=true;
		if(num<2){
			return false;
		}else{
			for(int i=2;i<num;i++){
				if(num%i==0){
					flag=false;
					break;
				}
			}
			return flag;
		}
		
		
	}
	public void getPrimes(int max){
		ArrayList al= new ArrayList();
		for(int i=2;i<max;i++){
			if(isPrimes(i)){
				al.add(i);
			}
		}
		Object[] o=al.toArray();
		System.out.println(Arrays.toString(o));
		
	}
	
	/**
	 * ��ν���������� ��ָ�����ǡ�õ�����������֮�ͣ�����6=1+2+3
	 * ����һ�����ֵmax�� ����һ�����飬 ��������С��max ����������
	 * @param max
	 * @return
	 */
	public void getPerfectNumbers(int max){
		
		ArrayList alist= new ArrayList();
		for(int i=1;i<=max;i++){
			int sum=0;
			for(int j=1;j<=i/2;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i){
				alist.add(i);
			}
		}
		System.out.println(alist);
	}
	
	/**
	 * ��seperator ������ array����������
	 * ����array= [3,8,9], seperator = "-"
	 * �򷵻�ֵΪ"3-8-9"
	 * @param array
	 * @param s
	 * @return
	 */
	public void join(int[] array, String seperator){
		StringBuilder sb =new StringBuilder();
		for(int i=0;i<array.length;i++){
			sb.append(array[i]);
			if(i<array.length-1){
				sb.append(seperator);
			}
		}
		System.out.println(sb.toString()); 
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayUtil my= new MyArrayUtil();
		int[] a={0,1,2,3,4,6,7,8,6,0,12,0,29,98,0,2};
//		my.reverseArray(a);
//		my.removeZero(a);
		
		int[] array1={1,2,3};
		int[] array2={3,4,5};
//		my.merge(array1, array2);
//		my.getPrimes(20);
		my.getPerfectNumbers(30);
		my.join(array1, "-");
		System.out.println(Arrays.toString(my.grow(array1, 3)));
		my.fibonacci(15);
	}

}