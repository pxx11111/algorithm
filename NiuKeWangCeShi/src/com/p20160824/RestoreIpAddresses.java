package com.p20160824;
import java.util.*;

	public class RestoreIpAddresses {
		public static void main(String[] args) {
			RestoreIpAddresses re=new RestoreIpAddresses();
			String s="25525511135";
			ArrayList<String>arr=re.restoreIpAddresses(s);
			for (String string : arr) {
				System.out.println(string);
			}
		}
    public  ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> ret=new ArrayList<String>();
        ArrayList<String> path=new ArrayList<String>();
        if(s.length()<4||s.length()>12) return ret;
        restore(s,0,3,path,ret);
        return ret;
    }
    public void restore(String s,int start, int toCut,ArrayList<String> path,
                        ArrayList<String> ret){
        if(toCut==0){
            String part=s.substring(start);
            if(isLeagle(part)){
                path.add(part);
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<3;i++){
                    sb.append(path.get(i));
                    sb.append(".");
                }
                sb.append(path.get(3));
                ret.add(sb.toString());
                path.remove(path.size()-1);
            }
        }
        else{
            for(int i=start+1;i<Math.min(start+4,s.length());i++){
                String part=s.substring(start,i);
                if(isLeagle(part)){
                    path.add(part);
                    restore(s,i,toCut-1,path,ret);
                    path.remove(path.size()-1);
                }
            }
        }
    }
     
    public boolean isLeagle(String part){
        int val=Integer.parseInt(part);
        if(val>255) return false;
        if(part.charAt(0)=='0'&&part.length()>1) return false;
        return true;
    }
}