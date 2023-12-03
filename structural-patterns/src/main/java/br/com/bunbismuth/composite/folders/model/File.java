package br.com.bunbismuth.composite.folders.model;

public class File implements FileSystemItem {
  private final String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public void print(String structure) {
    System.out.println(structure + name);
  }
}
