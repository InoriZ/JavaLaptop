package com.example.demo.Controller;


import com.example.demo.Model.Attribute;
import com.example.demo.Model.Category;
import com.example.demo.Model.Product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AdminController extends BaseController{
    @RequestMapping("/Admin/Product")
    String product(Model model){
        model.addAttribute("listProduct",Products.getAllProduct());
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/Product";
    }
    @RequestMapping("/Admin/Attribute")
    String attribute(Model model){
        model.addAttribute("listAttribute", Attributes.getAllAttribute());
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/Attribute";
    }

    @RequestMapping("/Admin/Category")
    public String category(Model model){
        model.addAttribute("listCategory", Categories.GetAllCategory());
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/Category";
    }
    @RequestMapping("/Admin/InvoiceDetail")
    String invoice(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/InvoiceDetail";
    }
    @RequestMapping("/Admin/AddCategory")
    String addCategory(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        Category category=new Category();
        model.addAttribute("category", category);
        return "/Admin/addCategory";
    }
    @PostMapping(value="/SaveCategory")
    public String SaveCategory(@ModelAttribute("category")  Category category) {
        Categories.SaveCategory(category);
        return "redirect:/Admin/Category";
    }
    @RequestMapping("/Admin/EditCategory/{idCategory}")
    String editCategory(@PathVariable (value= "idCategory") int idCategory, Model model){
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        model.addAttribute("category", Categories.getCategorybyid(idCategory));
        return "/Admin/editCategory";
    }

    @RequestMapping("/Admin/DeleteCategory/{idCategory}")
    String deleteCategory(@PathVariable (value = "idCategory") int idCategory){
        this.Categories.deleteCategorybyId(idCategory);
        return "redirect:/Admin/Category";
    }

    @RequestMapping("/Admin/AddAttribute")
    String addAttribute(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        Attribute attribute=new Attribute();
        model.addAttribute("attribute",attribute);
        return "/Admin/addAttribute";
    }
    @PostMapping(value = "/SaveAttribute")
    String saveAttribute(@ModelAttribute("attribute")  Attribute attribute)
    {
        Attributes.SaveAttribute(attribute);
        return "redirect:/Admin/Attribute";
    }
    @RequestMapping("/Admin/EditAttribute/{id}")
    String editAttribute(@PathVariable (value= "id") int id, Model model){
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        model.addAttribute("attribute", Attributes.getAttributebyid(id));
        return "/Admin/EditAttribute";
    }
    @RequestMapping("/Admin/DeleteAttribute/{id}")
    String deleteAttribute(@PathVariable (value = "id") int id){
        this.Attributes.deleteAttributebyId(id);
        return "redirect:/Admin/Attribute";
    }
    @RequestMapping("/Admin/AddProduct")
    String addProduct(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        Product product=new Product();
        model.addAttribute("product", product);
        return "/Admin/AddProduct";
    }
    @PostMapping(value = "/SaveProduct")
    String saveProduct(@ModelAttribute("product")  Product product, Integer idCate)
    {
        System.out.println(idCate);
        System.out.println(product.getName());
        Products.SaveProduct(product,idCate);
        return "redirect:/Admin/Product";
    }
    @RequestMapping("/Admin/EditProduct/{idProduct}")
    String editProduct(@PathVariable (value= "idProduct") int idProduct,Model model){
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        model.addAttribute("product", Products.getProductbyid(idProduct));
        return "/Admin/EditProduct";
    }
    
   
}
