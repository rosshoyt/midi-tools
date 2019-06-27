package midi_file_tools;

import com.google.common.io.Files;
import com.google.common.collect.Sets;
import com.sun.istack.internal.NotNull;
import midi_file_tools.exceptions.UnsupportedFileTypeException;



import java.io.File;
import java.util.Set;


/**
 * Works with an individual .mid/.midi file to extract useful information and return
 * SQL database-persistable analysis data
 */
public class MidiFileAnalyzer {

   private MidiFileParser midiFileParser;
   // Static refs


   /**
    * Creates a midi file
    * @param file MIDI file to be processed
    * @throws midi_file_tools.exceptions.UnsupportedFileTypeException
    */
   public MidiFileAnalyzer(@NotNull File file) {
      // Validate file passed into constructor
   }
}
