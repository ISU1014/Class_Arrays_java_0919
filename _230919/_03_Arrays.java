package _230919;

public class _03_Arrays {

	public static void main(String[] args) {
		double score[][] = {{3.3,3.4},
							{3.5,3.6},
							{3.7,4.0},
							{4.1,4.2}};
		double d = score.length;
		System.out.println(d);
		
		
		
		double sum = 0;
		for(int year=0; year<score.length; year++)
			for(int term=0; term<score[year].length; term++)
				sum += score[year][term]; 
		
		int n = score.length;
		int m = score[0].length;
		System.out.println("4년 전체 평점 평균은"+ sum/(n+m));
		
		}

	}
