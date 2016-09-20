package com.pxx;

import java.util.Stack;

public class DFSTest {

        // �洢�ڵ���Ϣ
        private char[] vertices;

        // �洢����Ϣ���ڽӾ���
        private  int[][] arcs;

        // ͼ�Ľڵ���
        private int vexnum;

        // ��¼�ڵ��Ƿ��ѱ�����
        private boolean[] visited;

        // ��ʼ��
        public DFSTest(int n) {
              vexnum = n;
              vertices = new char[n];
              arcs = new int[n][n];
              visited = new boolean[n];
              for (int i = 0; i < vexnum; i++) {
                 for (int j = 0; j < vexnum; j++) {
                     arcs[i][j] = 0;
                 }
              }
        }

        // ��ӱ�(����ͼ)
        public void addEdge(int i, int j) {
              // �ߵ�ͷβ����Ϊͬһ�ڵ�
              if (i == j)return;

              arcs[i][j] = 1;
              arcs[j][i] = 1;
        }

        // ���ýڵ㼯
        public void setVertices(char[] vertices) {
            this.vertices = vertices;
        }

        // ���ýڵ���ʱ��
        public void setVisited(boolean[] visited) {
            this.visited = visited;
        }

        // ��ӡ�����ڵ�
        public void visit(int i){
            System.out.print(vertices[i] + " ");
        }

        // �ӵ�i���ڵ㿪ʼ������ȱ���
        private void traverse(int i){
            // ��ǵ�i���ڵ��ѱ���
            visited[i] = true;
            // ��ӡ��ǰ�����Ľڵ�
            visit(i);

            // �����ڽӾ����е�i���ڵ��ֱ����ͨ��ϵ
            for(int j=0;j<vexnum;j++){
                // Ŀ��ڵ��뵱ǰ�ڵ�ֱ����ͨ�����Ҹýڵ㻹û�б����ʣ��ݹ�
                if(arcs[i][j]==1 && visited[j]==false){
                    traverse(j);
                }
            }
        }

        // ͼ��������ȱ������ݹ飩
        public void DFSTraverse(){
            // ��ʼ���ڵ�������
            for (int i = 0; i < vexnum; i++) {
                visited[i] = false;
            }

            // ��û�б������Ľڵ㿪ʼ��ȱ���
            for(int i=0;i<vexnum;i++){
                if(visited[i]==false){
                    // ������ͨͼ��ֻ��ִ��һ��
                    traverse(i);
                }
            }
        }

        // ͼ��������ȱ������ǵݹ飩
        public void DFSTraverse2(){
            // ��ʼ���ڵ�������
            for (int i = 0; i < vexnum; i++) {
                visited[i] = false;
            }

            Stack<Integer> s = new Stack<Integer>();
            for(int i=0;i<vexnum;i++){
                if(!visited[i]){
                    //��ͨ��ͼ��ʼ�ڵ�
                    s.add(i);
                    do{ 
                        // ��ջ
                        int curr = s.pop();

                        // ����ýڵ㻹û�б�������������ýڵ㲢���ӽڵ���ջ
                        if(visited[curr]==false){
                            // ��������ӡ
                            visit(curr);
                            visited[curr] = true;

                            // û�������ӽڵ���ջ
                            for(int j=vexnum-1; j>=0 ; j-- ){
                                if(arcs[curr][j]==1 && visited[j]==false){
                                    s.add(j);
                                }
                            }
                        }
                    }while(!s.isEmpty());
                }
            }
        }

        public static void main(String[] args) {
            DFSTest g = new DFSTest(9);
            char[] vertices = {'A','B','C','D','E','F','G','H','I'};
            g.setVertices(vertices);

            g.addEdge(0, 1);
            g.addEdge(0, 5);
            g.addEdge(1, 0);
            g.addEdge(1, 2);
            g.addEdge(1, 6);
            g.addEdge(1, 8);
            g.addEdge(2, 1);
            g.addEdge(2, 3);
            g.addEdge(2, 8);
            g.addEdge(3, 2);
            g.addEdge(3, 4);
            g.addEdge(3, 6);
            g.addEdge(3, 7);
            g.addEdge(3, 8);
            g.addEdge(4, 3);
            g.addEdge(4, 5);
            g.addEdge(4, 7);
            g.addEdge(5, 0);
            g.addEdge(5, 4);
            g.addEdge(5, 6);
            g.addEdge(6, 1);
            g.addEdge(6, 3);
            g.addEdge(6, 5);
            g.addEdge(6, 7);
            g.addEdge(7, 3);
            g.addEdge(7, 4);
            g.addEdge(7, 6);
            g.addEdge(8, 1);
            g.addEdge(8, 2);
            g.addEdge(8, 3);

            System.out.print("������ȱ������ݹ飩��");
            g.DFSTraverse();

            System.out.println();

            System.out.print("������ȱ������ǵݹ飩��");
            g.DFSTraverse2();
        }

}