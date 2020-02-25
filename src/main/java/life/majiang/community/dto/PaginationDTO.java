package life.majiang.community.dto;

import life.majiang.community.model.Question;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PaginationDTO
 * @Description TODO
 * @Author admin
 * @Date 2020-01-02 14:53
 * @Version 1.0
 */
@Data
public class PaginationDTO<T> {
    private List<T> data;
    private boolean showPreview;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    // 页码等装配
    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;
        this.page = page;
        // 中间数字显示部分
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }
        // 是否展示上一页 <
        if (page == 1) {
            showPreview = false;
        } else {
            showPreview = true;
        }
        // 是否展示下一页 >
        if (page == totalPage){
            showNext = false;
        }else {
            showNext = true;
        }
        // 是否展示第一页
        if (pages.contains(1)){
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }
        // 是否展示最后一页
        if (pages.contains(totalPage)){
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}
