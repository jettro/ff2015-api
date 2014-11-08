package nl.gridshore.ff2015.data;

import java.util.List;

/**
 * Represents a fut 15 page that contains the data.
 *
 * @author Roberto van der Linden
 */
public class PageData {

    private Integer page;
    private Integer totalPages;
    private Integer totalResults;
    private String type;
    private Integer count;
    private List<Fut15Player> items;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Fut15Player> getItems() {
        return items;
    }

    public void setItems(List<Fut15Player> items) {
        this.items = items;
    }
}
