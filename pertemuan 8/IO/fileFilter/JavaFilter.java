import java.io.File;
import javax.swing.filechooser.*;

class JavaFilter extends FileFiller{
  private static final String JAVA = "java";
  private static final char DOT = '.';

  public JavaFilter(){
    super();
  }

  public boolean accept(File f){
    if(f.isDirectory()){
      return true;
    }
    if(extention(f).equalsIgnoreCase(JAVA)){
      return true;
    }else{
      return false;
    }
  }

  public String getDescription(){
    return "java source file (.java)";
  }

  private String extention(File f){
    String filename = f.getName();
    int loc = filename.lastIndexOf(DOT);
    if(loc > 0 && loc < filename.length()-1){
      return filename.substring(loc+1);
    }else{
      return "";
    }
  }
}
