public interface nptel_17 {
    public static void main(String args[]) {
        int year;
        java.util.Calendar current; 
        current = java.util.Calendar.getInstance(); // Create a Calendar instance
        year = current.get(java.util.Calendar.YEAR); // Access the YEAR field statically through Calendar
        
        // Print the current Year
        System.out.println("Current Year: " + year);
    }
}
