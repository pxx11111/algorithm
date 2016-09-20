package cn.edu.jp.array;
import java.lang.reflect.Array;

public class ArrayTester3
{
    public static void main(String[] args)
    {
        int[] dims = new int[] { 5, 10, 15 };

        // ע��������������
        System.out.println(Integer.TYPE);    // int
        System.out.println(Integer.class);    // Integer

        // ����һ����ά���飬������������ά�ȷֱ���5,10,15
        Object array = Array.newInstance(Integer.TYPE, dims);
        // �ɱ������Ҳ��������д��
        // Object array = Array.newInstance(Integer.TYPE, 5,10,15);

        System.out.println(array instanceof int[][][]);
        
        Class<?> classType0 = array.getClass().getComponentType();    // ��������Ԫ������
        System.out.println(classType0);    // ��ά�����Ԫ��Ϊ��ά���飬�����class [[I

        // ��õ�һ�������Ϊ3�����飬���ص���һ����ά����
        Object arrayObject = Array.get(array, 3);
        Class<?> classType = arrayObject.getClass().getComponentType();    // ��������Ԫ������
        System.out.println(classType);    // ��ά�����Ԫ��Ϊһά���飬�����class [I

        // �˴����ص���һ��һά����
        arrayObject = Array.get(arrayObject, 5);
        Class<?> classType2 = arrayObject.getClass().getComponentType();    // ��������Ԫ������
        System.out.println(classType2);    // һά�����Ԫ��Ϊint

        // ��һά�����±�Ϊ10��λ������ֵΪ37
        Array.setInt(arrayObject, 10, 37);

        int[][][] arrayCast = (int[][][]) array;
        System.out.println(arrayCast[3][5][10]);
    }

}