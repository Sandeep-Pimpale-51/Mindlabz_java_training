/*The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices*/

class Matrix{
  int row,column;
  int[][] a;
  public Matrix(int r, int c){
    row = r;
    column = c;
    a = new int[row][column];
  }

  public int getRows(){
    return row;
  }
  public int getColumns(){
    return column;
  }
  public int getElement(int r, int c){
    return a[r][c];
  }
  public void setElement(int r, int c, int element){
    a[r][c] = element;
  }
  public static Matrix add(Matrix x, Matrix y){
    if((x.row == y.row) && (x.column == y.column)){
      Matrix m = new Matrix(x.row,x.column);
      for(int i = 0;i<m.row;i++){
        for(int j = 0;j<m.column;j++){
          m.setElement(i,j,(x.getElement(i,j)+y.getElement(i,j)));
        }
      }
      return m;
    }
    else{
      System.out.println("Matrices cannot be added");
      return new Matrix(0,0);
    }

  }

  public static Matrix product(Matrix x, Matrix y){
      Matrix m = new Matrix(x.row,y.column);
      
      for(int j = 0;j<x.row;j++){
        for(int i = 0;i<y.column;i++){
          int sum = 0;
          for(int k = 0;k<x.column;k++){
            sum = sum+(x.getElement(j,k)*y.getElement(k,i));
            
          }
          m.setElement(j,i,sum);
        }
      }

      return m;
    }

  public void printMatrix(){
    System.out.println("Matrix is :");
    for(int i = 0;i<row;i++){
        for(int j = 0;j<column;j++){
          System.out.print(a[i][j]+"\t");
        }
        System.out.println("");
      }
  }
}

class Q14{
  public static void main(String[] args){
    Matrix m = new Matrix(3,3);
    Matrix n = new Matrix(3,3);
    int k = 1;
    for(int i = 0;i<3;i++){
      for(int j = 0;j < 3;j++){
        m.setElement(i,j,k);
        k++;
        n.setElement(i,j,k);
        k++;
      }
    }

    m.printMatrix();
    n.printMatrix();

    Matrix o = Matrix.add(m,n);
    o.printMatrix();

    Matrix p = Matrix.product(m,n);
    p.printMatrix();
  }
}
									
