package Nitra;
import java.util.*;
public class MatrixRotate {
	public static void main(String[] args) {
		
		int row=3,col=3;
		int l=0;int m=0;
		int k=1;		
		System.out.println("row and column is : "+row+"  "+col);
		int[][] a=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=k;
				k++;
			}
		}
		for(int[] x:a) {
			System.out.println(Arrays.toString(x));
		}
		int[][] b=new int[row][col];
		
		for(int i=0;i<col;i++) {
			if(l<3) {
				for(int j=row-1;j>=0;j--) {
					if(m<3) {
						b[l][m]=a[j][i]; 
						m++;
					}
				}
				m=0;
				l++;
			}
		}
		System.out.println("rotated matrix is : ");
		for(int[] x:b) {
			System.out.println(Arrays.toString(x));
		}
	}
}
