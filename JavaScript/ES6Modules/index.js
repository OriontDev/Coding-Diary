import {PI, getCircumference, getArea, getVolume} from './mathUtil.js';

console.log(PI);

const circumferece = getCircumference(10);
const area = getArea(10);
const volume = getVolume(10);

console.log(`${circumferece.toFixed(2)}cm`)