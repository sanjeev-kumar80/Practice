const mongoose = require('mongoose');
mongoose.connect('mongodb://127.0.0.1:27017/sam')
.then(()=>{
    console.log("DB is connected");
})
.catch((err)=>{
    console.log("Db is not connected");
    console.log(err);
})

// schema
// const { Schema } = mongoose;  d structure ki ha to nicha dot operator use kiya ha
const movieSchema = mongoose.Schema({
    name:String,
    rating:Number,
    year:Number,
    isWatched:Boolean
});

// model--->collection for db
const Movie = mongoose.model('Movie', movieSchema);//java script ki class
// console.log(Movie);

// make a new object
let ironman=new Movie({//create a new object model==js class
    name:"ironman",
    rating:4,
    year:2015,
    isWatched:false
})
ironman.save();
console.log(ironman);
