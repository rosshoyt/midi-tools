package midi_file_tools;

import com.google.common.collect.Sets;
import com.google.common.io.Files;
import midi_file_tools.exceptions.UnsupportedFileTypeException;

import java.io.File;
import java.util.Set;

public class MidiFileValidator {

   private static final Set<String> supportedFileExtensions =
         Sets.newHashSet("mid", "midi");

   public boolean isValidMIDIFile(File file) {
      if(file != null && supportedFileExtensions.contains(
            Files.getFileExtension(file.getName())))
            return true;
      return false;
   }

}