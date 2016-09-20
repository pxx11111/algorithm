package com.pxx;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class Calendarshowing {
 static Calendar  c   =  Calendar.getInstance();
 static int year = c.get(Calendar.YEAR), month = c.get(Calendar.MONTH)+1,
		 monthday = 0;
 static String[] weekdaystr = { "日", "一", "二", "三", "四", "五", "六" };
 JFrame frame = new JFrame("日历表");
// JPanel panel = new JPanel();
 static JLabel[]dayLabel = new JLabel[49];
 static JPanel showPanel;
 JButton Prebutton = new JButton("上一月");
 JButton Nextbutton = new JButton("下一月");
 JLabel showLabel =  new JLabel();
 static Border Border01 = BorderFactory.createLineBorder(Color.BLUE, 1);
 public Calendarshowing() {
  //frame.setResizable(false);
  showPanel = new JPanel();
  frame.setBounds(400, 200, 400, 300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Container content = frame.getContentPane();
  final JPanel buttonPanel = new JPanel();
  buttonPanel.setLayout(new FlowLayout());
  
  Prebutton.addActionListener(new PressButton());
  
  Nextbutton.addActionListener(new PressButton());
  buttonPanel.add(Prebutton);
  buttonPanel.add(showLabel);
  showLabel.setHorizontalAlignment(JLabel.CENTER);
  showLabel.setText("<html><Font size = '6',color = 'RED'>"+"日历: "+"<html><Font size='4',color='Green'>"+year+"年"+month+"月"+"</Font></html>");
  showLabel.setToolTipText("今天是公元"+c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日");
  buttonPanel.add(Nextbutton);
  content.add(buttonPanel, BorderLayout.NORTH);
  
  final GridLayout gridLayout = new GridLayout(0, 7);
  gridLayout.setHgap(10);
  gridLayout.setVgap(10);
  showPanel.setLayout(gridLayout);
  content.add(showPanel, BorderLayout.CENTER);
  frame.setVisible(true);
 }

 public class PressButton implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
   // TODO Auto-generated method stub
   JButton button = (JButton)e.getSource();
   if (button == Prebutton)
   {
    month--;
    if (month <= 0){
     year--;
     month+=12;
    }
   }
   else{
    month++;
    if (month > 12){
     year++;
     month-=12;
    }
   }
   showPanel.removeAll();
   showPanel.updateUI();
   new showing();
   showLabel.setHorizontalAlignment(JLabel.CENTER);
   showLabel.setText("<html><Font size = '6',color = 'RED'>"+"日历: "+"<html><Font size='4',color='Green'>"+year+"年"+month+"月"+"</Font></html>");
   showLabel.setToolTipText("今天是公元"+c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日");
  }
 }
 
 static class showing{
  
  public boolean isLeapYear(int year1) // 判断是否是闰年
  {
   return ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0));
  }

  public  int firstDay() // 计算该年第一天是星期几
  {
   long n = year * 365;
   for (int i = 1; i < year; i++){
    if (isLeapYear(i)){
     n++;
    }
   }
   return (int)n%7;
  }

  public void printWeek() // 设置表头
  {
   for (int i = 0; i < 7; i++) {
    dayLabel[i] = new JLabel(weekdaystr[i],JLabel.CENTER);
    dayLabel[i].setBackground(Color.BLACK);
    dayLabel[i].setForeground(Color.RED);
    showPanel.add(dayLabel[i]);
   }
  }

  public int getMonthDay(int m) // 获取每个月的天数
  {
   switch (m) {
   case 1:
   case 3:
   case 5:
   case 7:
   case 8:
   case 10:
   case 12:
    return 31;
   case 4:
   case 6:
   case 9:
   case 11:
    return 30;
   case 2:
    if (isLeapYear(year))
     return 29;
    else
     return 28;
   default:
    return 0;
   }
  }
  
  public  int getDays(){
   monthday = 0;
   for (int i = 1;i<month;i++)
    monthday+=getMonthDay(i);
   return (firstDay()+(monthday%7))%7;
  }
  
  public showing(){
   int n =1 ;
   printWeek();
   int k = getDays();
   int   Year   =   c.get(Calendar.YEAR); 
   int   Month   =   c.get(Calendar.MONTH);
   Month += 1;
   int   Date   =   c.get(Calendar.DATE);
   for (int j = 7;n<=getMonthDay(month);j++){
    if (j < k+7){
    dayLabel[j] = new JLabel();
    showPanel.add(dayLabel[j]);
    }
    else{
    dayLabel[j] = new JLabel(""+n,JLabel.CENTER);
    dayLabel[j].setToolTipText("星期"+weekdaystr[(j)%7]);
    if (Year == year&&Month==month&&Date == n){
     dayLabel[j].setText("<html><Font size = '6',color = 'BLUE'>"+n+"</Font></html>");
     dayLabel[(Date-1)%7].setForeground(Color.BLUE);
    }
    showPanel.add(dayLabel[j]);
    n++;
    }
   }
   showPanel.setBorder(Border01);
  }
 }
 
 public static void main(String[] args) {
  Calendarshowing c = new Calendarshowing();
  showing s = new Calendarshowing.showing();
 }
}
