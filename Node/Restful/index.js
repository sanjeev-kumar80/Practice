const express=require('express');
const app=express();
const path=require('path');
const  methodOverride = require('method-override')e


let comments=[
    { id: 1, name: "Sam", comment: "kuch bhi" },
    { id: 2, name: "Ajay", comment: "kuch bhi" },
    { id: 3, name: "Jatin", comment: "kuch bhi" },
    { id: 4, name: "Akashay", comment: "kuch bhi" }
]

app.set('view engine','ejs');
app.set('views',path.join(__dirname,'views'));
app.use(express.urlencoded({extended:true}));//for form data
app.use(express.join())//fro application
app.use(methodOverride('_method'))  // override with POST having ?_method=DELETE

app.get('/',(req,res)=>{
    res.get("root ma we;lcome ha");
})


// task 1 display all the block
app.get('/blogs',(req,res)=>{
    res.render('index',{comments})
})

// task-2 show just a form for adding a new blog
app.get('/blog/new',(req,res)=>{
    res.render('new')
})

// task 3-->add new blog to the database(in this file database work as )
app.post('blogs',(req,res)=>{
    // console.log(req.body());//this show the data in the object form u can d structure
    let {username,comment}=req.body();
    comments.push({username,comment,id:comments.length});
    res.redirect('/blogs');
})

// task-4 --> show info about a  particular blog
app.get('/blog/:id',(req,res)=>{
    let {id}=req.params;
    let foundComment=comments.find((comment)=>{ comment.id == id})//because params are in string format
    console.log(findComment);
    res.render('show',{foundComment})
})
// task -5-->to get the form for editing the blog
app.get('/blogs/:id/edit',(req,res)=>{
    let {id}=req.params;
    let foundComment=comments.find((comment)=>{ comment.id == id})
    res.render('edit',foundComment);
})


// task 6 partical change in the page using patch

app.patch('/blogs/;id',(req,res)=>{
    let {id}=req.params;
    let foundComment=comments.find((comment)=>{  return comment.id == id});
    let {comment}=req.body;
    foundComment.comment=comment;//changing already data to the newly data
    res.redirect('/blogs');

});

// task 7 to delete a blog in the db
app.delete('/blogs/:id',(req,res)=>{
    let {id}=req.params;
    let newArray=comments.filter((comment)=>{return comment.id!=id});
    comments=newArray;
    res.redirect('/blogs');
});

app.listen(8080,()=>{
    console.log("server is conntected");
});