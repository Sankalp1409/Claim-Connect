function toggle() {
  var maindiv = document.querySelector("#maindiv");
  maindiv.classList.toggle("active");
  var container = document.querySelector(".container");
  container.classList.toggle("active");
}

load()
{
    console.log("HEllo");
}

/* Form Validation Code */
const slidePage = document.querySelector(".slide-page");
const nextBtnFirst = document.querySelector(".firstNext");
const prevBtnSec = document.querySelector(".prev-1");
const nextBtnSec = document.querySelector(".next-1");
const prevBtnThird = document.querySelector(".prev-2");
const nextBtnThird = document.querySelector(".next-2");
const prevBtnFourth = document.querySelector(".prev-3");
const submitBtn = document.querySelector(".submit");
const progressText = document.querySelectorAll(".step p");
const progressCheck = document.querySelectorAll(".step .check");
const bullet = document.querySelectorAll(".step .bullet");
let current = 1;
nextBtnFirst.addEventListener("click", function (event) {
  event.preventDefault();
  slidePage.style.marginLeft = "-25%";
  bullet[current - 1].classList.add("active");
  progressCheck[current - 1].classList.add("active");
  progressText[current - 1].classList.add("active");
  current += 1;
});
nextBtnSec.addEventListener("click", function (event) {
  event.preventDefault();
  slidePage.style.marginLeft = "-50%";
  bullet[current - 1].classList.add("active");
  progressCheck[current - 1].classList.add("active");
  progressText[current - 1].classList.add("active");
  current += 1;
});
nextBtnThird.addEventListener("click", function (event) {
  event.preventDefault();
  slidePage.style.marginLeft = "-75%";
  bullet[current - 1].classList.add("active");
  progressCheck[current - 1].classList.add("active");
  progressText[current - 1].classList.add("active");
  current += 1;
});
submitBtn.addEventListener("click", function () {
  bullet[current - 1].classList.add("active");
  progressCheck[current - 1].classList.add("active");
  progressText[current - 1].classList.add("active");
  current += 1;
  setTimeout(function () {
    alert("Your Form Successfully Signed up");
    location.reload();
  }, 800);
});
prevBtnSec.addEventListener("click", function (event) {
  event.preventDefault();
  slidePage.style.marginLeft = "0%";
  bullet[current - 2].classList.remove("active");
  progressCheck[current - 2].classList.remove("active");
  progressText[current - 2].classList.remove("active");
  current -= 1;
});
prevBtnThird.addEventListener("click", function (event) {
  event.preventDefault();
  slidePage.style.marginLeft = "-25%";
  bullet[current - 2].classList.remove("active");
  progressCheck[current - 2].classList.remove("active");
  progressText[current - 2].classList.remove("active");
  current -= 1;
});
prevBtnFourth.addEventListener("click", function (event) {
  event.preventDefault();
  slidePage.style.marginLeft = "-50%";
  bullet[current - 2].classList.remove("active");
  progressCheck[current - 2].classList.remove("active");
  progressText[current - 2].classList.remove("active");
  current -= 1;
});

/* Input Type Currency */

$("input[data-type='currency']").on({
  keyup: function () {
    formatCurrency($(this));
  },
  blur: function () {
    formatCurrency($(this), "blur");
  },
});

function formatNumber(n) {
  // format number 1000000 to 1,234,567
  return n.replace(/\D/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

function formatCurrency(input, blur) {
  // appends $ to value, validates decimal side
  // and puts cursor back in right position.

  // get input value
  var input_val = input.val();

  // don't validate empty input
  if (input_val === "") {
    return;
  }

  // original length
  var original_len = input_val.length;

  // initial caret position
  var caret_pos = input.prop("selectionStart");

  // check for decimal
  if (input_val.indexOf(".") >= 0) {
    // get position of first decimal
    // this prevents multiple decimals from
    // being entered
    var decimal_pos = input_val.indexOf(".");

    // split number by decimal point
    var left_side = input_val.substring(0, decimal_pos);
    var right_side = input_val.substring(decimal_pos);

    // add commas to left side of number
    left_side = formatNumber(left_side);

    // validate right side
    right_side = formatNumber(right_side);

    // On blur make sure 2 numbers after decimal
    if (blur === "blur") {
      right_side += "00";
    }

    // Limit decimal to only 2 digits
    right_side = right_side.substring(0, 2);

    // join number by .
    input_val = "$" + left_side + "." + right_side;
  } else {
    // no decimal entered
    // add commas to number
    // remove all non-digits
    input_val = formatNumber(input_val);
    input_val = "$" + input_val;

    // final formatting
    if (blur === "blur") {
      input_val += ".00";
    }
  }

  // send updated string to input
  input.val(input_val);

  // put caret back in the right position
  var updated_len = input_val.length;
  caret_pos = updated_len - original_len + caret_pos;
  input[0].setSelectionRange(caret_pos, caret_pos);
}

var claimform = document.querySelector("#claimform");

// imput fields
var claimname = document.querySelector("#claimname");
var claimdes = document.querySelector("#claimdes");
var currencyfield = document.querySelector("#currency-field");

claimform.addEventListener("submit", () => {
  var ip1 = claimname.value;
  var ip2 = claimdes.value;
  var ip3 = currencyfield.value;
  var obj = {
    ip1: ip1,
    ip2: ip2,
    ip3: ip3,
  };
  // arr.push(obj);
  localStorage.setItem(++localStorage.length, JSON.stringify(obj));
  // let stored = JSON.parse(localStorage.getItem(`data${i}`));
});
// console.log(i);

var submit = document.querySelector(".submit");
var detailsection = document.querySelector("#detailsection");

function StartGame() {
  var i = localStorage.length;
  for (var x = 0; x < i; x++) {
    var temp = x + 1;
    var ip1 = JSON.parse(localStorage.getItem(`${temp}`)).ip1;
    var ip2 = JSON.parse(localStorage.getItem(`${temp}`)).ip2;
    var ip3 = JSON.parse(localStorage.getItem(`${temp}`)).ip3;
    var div = document.createElement("div");
    div.classList.add("claimdet");
    div.innerHTML = `<div class="claimdiv">
            <div class="claim">
              <img
                src="https://static.vecteezy.com/system/resources/previews/002/641/198/original/invoice-icon-vector.jpg"
                alt=""
              />
              <div class="claimhead">
                <h3>${ip1}</h3>
                <p class="grey towrap">${ip2}</p>
              </div>
            </div>
            <div class="claimdetails">
              <div class="amount">
                <p class="grey">Sum</p>
                <h4>Rs. ${ip3}</h4>
              </div>
              <div class="docs">
                <p class="grey">Doc.</p>
                <h4><i class="ri-download-line"></i></h4>
              </div>
            </div>
          </div>`;
    detailsection.appendChild(div);
  }
}

if(localStorage.length > 0){
  document.querySelector("#sendreq").style.display = "initial";
  document.querySelector(".newshowdiv").style.display = "flex";
}
