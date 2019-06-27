package midi_file_tools;

import java.io.File;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MidiFileValidatorTest {

   MidiFileValidator midiFileValidator = new MidiFileValidator();




   @Test
   public void nullFile(){
      File file = null;
      boolean result = midiFileValidator.isValidMIDIFile(file);
      assertEquals(false, result);
   }
   @Test
   public void wrongFileExtension(){
      File file = new File("src/test/ReferenceMidiFiles/0001 3-Audio.wav");
      boolean result = midiFileValidator.isValidMIDIFile(file);
      assertEquals(false, result);
   }
//   @Test
//   public void tooBigFileSize(){
//      File file = new File();
//      boolean result = midiFileValidator.isValidMIDIFile(file);
//      assertEquals();
//   }
   @Test
   public void extensionMid(){
      File file = new File("src/test/ReferenceMidiFiles/helloWorld.mid");
      boolean result = midiFileValidator.isValidMIDIFile(file);
      assertEquals(true, result);
   }
   @Test
   public void extensionMidi(){
      File file = new File("src/test/ReferenceMidiFiles/Hoyt_Ross_London Cubase 8.0 MATERIAL.midi");
      boolean result = midiFileValidator.isValidMIDIFile(file);
      assertEquals(true, result);
   }
}
