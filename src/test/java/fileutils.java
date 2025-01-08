import java.io.File;

public class fileutils {
    public static void deleteFilesAndFoldersInDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("Directory does not exist: " + directoryPath);
            return;
        }

        // List all files and subdirectories inside the directory
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // If it's a directory, delete all files inside recursively
                    deleteFilesAndFoldersInDirectory(file.getAbsolutePath());
                }
                // Delete the file or directory
                if (file.delete()) {
                    System.out.println("Deleted: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to delete: " + file.getAbsolutePath());
                }
            }
        }
    }


    public static File getFirstFileInFirstDirectory() {
        // Specify the path to the Downloads folder
        String downloadsPath = "C:\\Users\\anakhurtsidze\\Desktop\\ana_khurtsidze_final_task\\build\\downloads";
        File downloadsDir = new File(downloadsPath);

        // Check if the Downloads directory exists
        if (!downloadsDir.exists() || !downloadsDir.isDirectory()) {
            System.out.println("Downloads directory not found.");
            return null;
        }

        // Get all directories inside the Downloads folder
        File[] directories = downloadsDir.listFiles(File::isDirectory);

        // Check if there are any directories
        if (directories == null || directories.length == 0) {
            System.out.println("No directories found in Downloads.");
            return null;
        }

        // Choose the first directory
        File firstDirectory = directories[0];

        // Get all files inside the first directory
        File[] files = firstDirectory.listFiles(File::isFile);

        // Check if there are any files in the directory
        if (files == null || files.length == 0) {
            System.out.println("No files found in the first directory.");
            return null;
        }

        // Choose the first file
        File firstFile = files[0];


        return firstFile;
    }


    public static void main(String[] args) {
        // Replace with the path of the folder you want to clean
        String path = "C:\\Users\\anakhurtsidze\\Desktop\\ana_khurtsidze_final_task\\build\\downloads";
//        deleteFilesAndFoldersInDirectory(path);
        getFirstFileInFirstDirectory();
    }
}
