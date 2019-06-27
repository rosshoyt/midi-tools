package com.rosshoyt.midi.domain_model;

import com.rosshoyt.misctools.JavaIOFileValidator;

import javax.annotation.Nonnull;
import java.io.File;

/**
 * A Multiutility wrapper for a file received through Spring Web File Upload
 * TODO Add JDBC/User Login functionality
 */

public class MidiFile {

   File file; // The raw file wrapped by this object
   boolean isValid;


   public MidiFile(@Nonnull File file) {
      this.file = file;
   }
}
