package com.newer.gb;

import java.io.File;

public class FileInfo {
      private File file;
      private long length;
	public FileInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FileInfo(File file, long length) {
		super();
		this.file = file;
		this.length = length;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
      
}
