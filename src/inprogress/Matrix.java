package inprogress;
public class Matrix {
    public double[][] it = new double[0][0];
    public int rowCount;
    public int columnCount;
    
    Matrix (int row, int column) {
        double[][] newIt = new double[row][column];
        it = newIt;
        rowCount = row;
        columnCount = column;
    }
    
    public void set (int row, int column, double value) throws MatrixException {
        if (row >= rowCount || column >= columnCount) {
            throw new MatrixException("That position doesn't exist in this Matrix");
        } else if (row < 0 || column < 0) {
            throw new MatrixException("That position doesn't exist in this Matrix"); 
        }
        it[row][column] = value;
    }
    
    public double get (int row, int column) throws MatrixException {
        if (row >= rowCount || column >= columnCount) {
            throw new MatrixException("That position doesn't exist in this Matrix");
        } else if (row < 0 || column < 0) {
            throw new MatrixException("That position doesn't exist in this Matrix"); 
        }
        return it[row][column];
    }
    
    public static Matrix add (Matrix a, Matrix b) throws MatrixException {
        if (a.rowCount != b.rowCount || a.columnCount != b.columnCount) {
            throw new MatrixException("That position doesn't exist in this Matrix");
        }
        Matrix c = new Matrix(a.rowCount, a.columnCount);
        for(int x = 0; x < c.rowCount; x ++) {
            for(int y = 0; y < c.columnCount; y ++) {
                c.set(x,y, (a.get(x,y) + b.get(x,y)));
            } 
        }
        return c;
    }
    
    public static Matrix subtract (Matrix a, Matrix b) throws MatrixException {
        if (a.rowCount != b.rowCount || a.columnCount != b.columnCount) {
            throw new MatrixException("That position doesn't exist in this Matrix");
        }
        Matrix c = new Matrix(a.rowCount, a.columnCount);
        for(int x = 0; x < c.rowCount; x ++) {
            for(int y = 0; y < c.columnCount; y ++) {
                c.set(x,y, (a.get(x,y) - b.get(x,y)));
            } 
        }
        return c;
    }

    
    
    
    
    
    
    public static class MatrixException extends Exception {
            public MatrixException() { super(); }
            public MatrixException(String s) { super(s); }
    }
}