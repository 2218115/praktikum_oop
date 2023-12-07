package Tugas.Bab8;

import java.util.ArrayList;
import java.util.List;

// class BarangSaver akan menangani tentang interaksi dengan penyimpanan Memori
public class BarangSaver implements Saveble {
  // variable list penyimpan kode barang
  private static List<Barang> barangs = new ArrayList<>();
  
  // implementasikan method dari interface Saveble
  @Override
  public void save(Barang barang) {
    if (barang == null) return;
    if (!barangs.isEmpty()) {
      Barang lastBarang = barangs.get(barangs.size() - 1);
      barang.setId(lastBarang.getId() + 1);
      barangs.add(barang);
    } else {
      barang.setId(barangs.size() + 1);
      barangs.add(barang);
    }
  }

  @Override
  public void update(Barang newBarang) {
    for (int index = 0;index < barangs.size();++index) {
      Barang b = barangs.get(index);
      if (b.getId() == newBarang.getId()) {
          barangs.set(index, newBarang);
          break;
      }
    }
  }

  @Override
  public void delete(int id) {
    for (int index = 0;index < barangs.size();++index) {
      Barang b = barangs.get(index);
      if (b.getId() == id) {
          barangs.remove(index);
          break;
      }
    }
  }

  @Override
  public List<Barang> findByName(String name) {
    List<Barang> filteredBarangs = new ArrayList<>();
    
    for (Barang b : barangs) {
      if (b.getNama().toLowerCase().contains(name.toLowerCase())) {
          filteredBarangs.add(b);
      }
    }
    
    return filteredBarangs;
  }

  @Override
  public List<Barang> findAll() {
    return barangs;
  }

  @Override
  public Barang findByKodeBarang(String kodeBarang) {
    Barang filteredBarang = null;
    
    for (Barang b : barangs) {
      if (b.getKodeBarang().equals(kodeBarang)) {
          filteredBarang = b;
          break;
      }
    }
    
    return filteredBarang;
  }

  @Override
  public Barang findById(int id) {
     Barang filteredBarang = null;
    
    for (Barang b : barangs) {
      if (b.getId() == id) {
          filteredBarang = b;
          break;
      }
    }
    
    return filteredBarang;
  }

  @Override
  public List<Barang> findByNameAndCategory(String name, String category) {
    List<Barang> filteredBarangs = new ArrayList<>();
    
    for (Barang b : barangs) {
      if (b.getNama().toLowerCase().contains(name.toLowerCase()) && b.getKategori().equals(category)) {
          filteredBarangs.add(b);
      }
    }
    
    return filteredBarangs;
  }

  @Override
  public List<Barang> findByCategory(String category) {
    List<Barang> filteredBarangs = new ArrayList<>();
    
    for (Barang b : barangs) {
      if (b.getKategori().equals(category)) {
          filteredBarangs.add(b);
      }
    }
    
    return filteredBarangs;
  }
  
  
  
}
