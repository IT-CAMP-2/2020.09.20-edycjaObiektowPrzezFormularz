package pl.camp.it.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.camp.it.model.Book;
import pl.camp.it.services.IBookService;

@Controller
public class SimpleController {

    @Autowired
    IBookService bookService;

    @RequestMapping(value = "/editBook/{id}", method = RequestMethod.GET)
    public String editBook(Model model, @PathVariable int id) {
        Book book = this.bookService.getBookById(id);
        model.addAttribute("book", book);

        return "bookEdit";
    }

    @RequestMapping(value = "/editBook/{id}", method = RequestMethod.POST)
    public String editBookInDB(@PathVariable int id, @ModelAttribute Book book) {
        System.out.println(book);
        this.bookService.saveBook(book);

        return "mian";
    }
}
