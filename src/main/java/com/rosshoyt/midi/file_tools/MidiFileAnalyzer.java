package com.rosshoyt.midi.file_tools;

import java.io.File;

import static com.rosshoyt.midi.conventions.FileExtensions.MIDI_EXTENSIONS;
import com.rosshoyt.misctools.JavaIOFileValidator;
import com.rosshoyt.midi.file_tools.exceptions.BadFileException;
import com.rosshoyt.midi.domain_model.MidiFile;

import java.util.Properties;

/**
 * High level file analyzer.
 * Works with one uploaded .mid/.midi file to extract useful information and return
 *
 * SQL database-persistable analysis data
 */

public class MidiFileAnalyzer {


   private static JavaIOFileValidator midiFileValidator = new JavaIOFileValidator(MIDI_EXTENSIONS);
   // Utilities
   MidiFile midiFile;


   /**
    * Creates a midi file
    * @param file MIDI file to be processed TODO file should be validated in React Front-End, pr shouldn't req validation
    * @throws UnsupportedFileTypeException
    */
   public MidiFileAnalyzer(File file) throws BadFileException {
      // Validate file passed into constructor
      if (midiFileValidator.isValid(file)) {
         this.midiFile = new MidiFile(file);
         analyze();
      }
      else throw new BadFileException();
   }
   private void analyze(){
      Properties headerProperties = parseHeader();;

   }
   private Properties parseHeader() {
      return null;
   }
}
