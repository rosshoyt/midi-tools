package com.rosshoyt.misctools;

import java.io.File;

import com.rosshoyt.midi.conventions.FileExtensions;
import com.rosshoyt.misctools.JavaIOFileValidator;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class JavaIOFileValidatorTest {

   JavaIOFileValidator javaIOFileValidator = new JavaIOFileValidator(FileExtensions.MIDI_EXTENSIONS);

   @Test
   public void nullFile(){
      File file = null;
      boolean result = javaIOFileValidator.isValid(file);
      assertFalse(result);
   }
   @Test
   public void wrongFileExtension(){
      File file = new File("src/test/ReferenceMidiFiles/0001 3-Audio.wav");
      boolean result = javaIOFileValidator.isValid(file);
      Assert.assertFalse(result);
   }

   @Test
   public void extensionMid(){
      File file = new File("src/test/ReferenceMidiFiles/helloWorld.mid");
      boolean result = javaIOFileValidator.isValid(file);
      assertTrue(result);
   }
   @Test
   public void extensionMidi(){
      File file = new File("src/test/ReferenceMidiFiles/Hoyt_Ross_London Cubase 8.0 MATERIAL.midi");
      boolean result = javaIOFileValidator.isValid(file);
      assertTrue(result);
   }
   // TODO Determine Maximum midi file size accepted (if helpful after testing alg speeds)
   // @Test
//   public void tooBigFileSize(){
//      File file = new File(/*MIDI File of > MAX_FILE SIZE*/ );
//      boolean result = javaIOFileValidator.isValid(file);
//      assertEquals();
//   }
}
