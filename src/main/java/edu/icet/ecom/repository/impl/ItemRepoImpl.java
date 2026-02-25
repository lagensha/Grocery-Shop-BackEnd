package edu.icet.ecom.repository.impl;

import edu.icet.ecom.dto.ItemDTO;
import edu.icet.ecom.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ItemRepoImpl implements ItemRepository {
    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addItems(ItemDTO itemDTO) {
        String sql="INSERT INTO item (ItemCode,Description,PackSize,UnitPrice,QtyOnHand)" +
                "VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                itemDTO.getItemCode(),
                itemDTO.getDescription(),
                itemDTO.getPackSize(),
                itemDTO.getUnitPrice(),
                itemDTO.getQtyOnHand()
        ) > 0;
    }

    @Override
    public boolean updateItems(ItemDTO itemDTO) {
       String sql="UPDATE item SET Description=?,PackSize=?,UnitPrice=?,QtyOnHand=?  WHERE  ItemCode=? ";
       return jdbcTemplate.update(sql,
               itemDTO.getDescription(),
               itemDTO.getPackSize(),
               itemDTO.getUnitPrice(),
               itemDTO.getQtyOnHand(),
               itemDTO.getItemCode()
               ) > 0;
    }

    @Override
    public boolean deleteItems(String itemCode) {
        String sql="DELETE FROM item WHERE ItemCode=?";
        return jdbcTemplate.update(sql, itemCode)>0;
    }

    @Override
    public List<ItemDTO> getAll() {
        String sql = "SELECT * FROM item";
        List<ItemDTO> itemDTOList = jdbcTemplate.query(sql,(rs, rowNum) -> {
            ItemDTO item=new ItemDTO();
          item.setItemCode(rs.getString(1));
            item.setDescription(rs.getString(2));
            item.setPackSize(rs.getString(3));
            item.setUnitPrice(rs.getInt(4));
            item.setQtyOnHand(rs.getInt(5));

            return item;
        });
        return itemDTOList;
    }
}
