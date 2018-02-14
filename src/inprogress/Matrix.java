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
        } else {
            it[row][column] = value;
        }
    }
    
    public double get (int row, int column) throws MatrixException {
        if (row >= rowCount || column >= columnCount) {
            throw new MatrixException("That position doesn't exist in this Matrix");
        }
        return it[row][column];
    }
    
    public static Matrix add (Matrix a, Matrix b) throws MatrixException {
        if (a.rowCount != b.rowCount || a.columnCount != b.columnCount) {
            throw new MatrixException("That position doesn't exist in this Matrix");
        }
        boolean empty = true;
        
        
        
        
    }

    
    
    
    
    
    
    public static class MatrixException extends Exception {
            public MatrixException() { super(); }
            public MatrixException(String s) { super(s); }
    }
}