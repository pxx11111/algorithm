package com.pxx;

public class LCS {
	 static String str1 = "cnblogs";
    static String str2 = "belong";

	static int[][] martix=new int[str1.length()+1][str2.length()+1];
	
	        public static void main(String[] args) {
	        	
                 LCS(str1, str2);

	            //ֻҪ�ó��������һ��λ�õ����ּ���
	           System.out.println("��ǰ��󹫹������еĳ���Ϊ:"+martix[str1.length()][str2.length()]);

	            
	        }

	        static void LCS(String str1, String str2)
	        {
	            //��ʼ���߽磬���˵�0�����
	            for (int i = 0; i <= str1.length(); i++)
	                martix[i][0] = 0;

	            for (int j = 0; j <= str2.length(); j++)
	                martix[0][j] = 0;

	            //������
	            for (int i = 1; i <= str1.length(); i++)
	            {
	                for (int j = 1; j <= str2.length(); j++)
	                {
	                    //��ȵ����
	                    if (str1.charAt(i - 1) == str2.charAt(j - 1))
	                    {
	                        martix[i][j] = martix[i - 1][j - 1] + 1;
	                    }
	                    else
	                    {
	                        //�Ƚϡ���ߡ��͡��ϱߡ���������max�����
	                        if (martix[i - 1][j] >= martix[i][j - 1])
	                            martix[i][ j] = martix[i - 1][ j];
	                        else
	                            martix[i][j] = martix[i][j - 1];
	                    }
	                }
	            }
	        
	    
	        }
}
