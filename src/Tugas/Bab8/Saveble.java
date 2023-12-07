package Tugas.Bab8;

import java.util.List;

public interface Saveble {
  void save(Barang barang);
  void update(Barang barang);
  void delete(int id);
  List<Barang> findByName(String name);
  List<Barang> findByNameAndCategory(String name, String category);
  List<Barang> findByCategory(String category);
  List<Barang> findAll();
  Barang findByKodeBarang(String kodeBarang);
  Barang findById(int id);
}
